#!/bin/bash

# Stop the script if any command fails
set -e

# Build the application
echo "Building the application..."
./gradlew build

TAG=${1:-runJavaPracticeApp}

# Run the application
echo "Starting the application..."
./gradlew "$TAG"