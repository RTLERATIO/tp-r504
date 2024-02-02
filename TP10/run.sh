#!/bin/bash

if [ "$1" == "" ]; then
    echo "Erreur: Argument vide."
    exit 1
else
    java -classpath "/home/user/lib/*.java" "$1"
fi
