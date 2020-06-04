# gcloud-ex

java app / spring / postgresql

to deploy on your cluster use command

kubectl apply -f k8s

API Example

1) Get All Students http://34.72.104.179:8080/student/all

2) Get Student by ID http://34.72.104.179:8080/student/{id}

3) Get All Student By Group http://34.72.104.179:8080/student/all/{group}

4) Post New Student http://34.72.104.179:8080/student/add

{
  "studentPersonalId": 1,
  "studentName": "Eugene",
  "studentSecondName": "Goldyrev",
  "studentGroupCode": "M05-916v"
}

5) Delete Student By Id http://34.72.104.179:8080/student/delete/{id}


DockerHub https://hub.docker.com/repository/docker/jmacgyve/tpos2goldyrev


Запросы можно сделать здесь https://reqbin.com
