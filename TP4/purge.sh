docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)
docker volume prune -f
docker container prune -f
docker network prune -f
docker image prune -f
