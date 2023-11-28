echo "Conteneur arreté :"
docker stop $(docker ps -a -q)
echo "Conteneur supprimé :"
docker rm $(docker ps -a -q)
