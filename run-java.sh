#!/bin/bash

# Set your Java source root
SRC_ROOT="$HOME/code/sandbox/src/main/java"

# Full file path passed by VS Code
FILE="$1"

# Ensure the file is inside the source root
if [[ "$FILE" != "$SRC_ROOT"* ]]; then
  echo "Error: File is not under source root ($SRC_ROOT)"
  exit 1
fi

# Get relative path from source root
REL_PATH="${FILE#$SRC_ROOT/}"

# Convert file path to class name
CLASS_PATH="${REL_PATH%.java}"                   # Remove .java
CLASS_NAME="${CLASS_PATH//\//.}"                 # Replace slashes with dots

# Change to source root and compile/run
cd "$SRC_ROOT" || exit 1
javac "$REL_PATH" && java "$CLASS_NAME"

