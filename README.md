# gcloud-ex

java app / spring / postgresql

to deploy on your cluster use command

kubectl apply -f k8s

API Example

1) Get All Students http://35.222.39.104:8080/student/all - список всех студентов

2) Get Student by ID http://35.222.39.104:8080/student/{id}

http://35.222.39.104:8080/student/5
[{"studentPersonalId":5,"studentName":"Eugene","studentSecondName":"Goldyrev","studentGroupCode":"M05-916v"}]


3) Get All Student By Group http://35.222.39.104:8080/student/all/{group}

http://35.222.39.104:8080/student/all/M05-916v
[{"studentPersonalId":5,"studentName":"Eugene","studentSecondName":"Goldyrev","studentGroupCode":"M05-916v"},{"studentPersonalId":6,"studentName":"qq","studentSecondName":"qqq","studentGroupCode":"M05-916v"}]



4) Post New Student http://35.222.39.104:8080/student/add

{
  "studentPersonalId": 1,
  "studentName": "Eugene",
  "studentSecondName": "Goldyrev",
  "studentGroupCode": "M05-916v"
}

5) Delete Student By Id http://34.72.104.179:8080/student/delete/{id}

http://34.72.104.179:8080/student/delete/5


DockerHub https://hub.docker.com/repository/docker/jmacgyve/tpos2goldyrev


Запросы можно сделать здесь https://reqbin.com
