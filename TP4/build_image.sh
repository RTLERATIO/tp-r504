#!/bin/bash

IMAGE_NAME="im-tp4"

docker build -t "$IMAGE_NAME" -f Dockerfile1 .

if [ $? -eq 0 ]; then
  echo "L'image Docker '$IMAGE_NAME' a été construite avec succès."
else
  echo "La construction de l'image Docker a échoué."
fi
