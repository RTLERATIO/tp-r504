#!/bin/bash

if [ "$1" == "" ]; then
    echo "Erreur: Argument vide."
    exit 1
else
    java -classpath ".:/home/user/lib/*" Client1 "$1"
fi
