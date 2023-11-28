#!/bin/bash

server1=0
server2=0

for ((i=0; i<500; i++)); do
  response=$(curl -s http://localhost:83)

  if [[ $response == "<h1>Hello 1</h1>" ]]; then
    ((server1++))
  elif [[ $response == "<h1>Hello 2</h1>" ]]; then
    ((server2++))
  fi

  echo "$response"
done

echo "Server 1 count: $server1"
echo "Server 2 count: $server2"
