#!/bin/bash

# Stop the script if any command fails
set -e

# Clean the build
echo "Cleaning the build..."
./gradlew clean

# Build the application
echo "Building the application..."
./gradlew build

# Run tests
echo "Running tests..."
./gradlew test
# ./gradlew test --warning-mode all

