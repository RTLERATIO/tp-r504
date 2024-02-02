#!/bin/bash

if [ "$#" -eq 0 ]; then
    echo "Erreur: Aucun argument fourni."
    exit 1
fi

if [ "$1" == "" ]; then
    echo "Erreur: Argument vide."
    exit 1
else
    java -classpath "/home/user/lib/*.java" "$1"
fi
