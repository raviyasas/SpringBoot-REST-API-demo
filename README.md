# SpringBoot-REST-API-demo
GET, POST, PATCH and DELETE

This is a sample project wich demonstrate how to use GET, POST, PATCH and DELETE in Spring Boot.

There are four APIs to use to get all users, add new user, update a user and delete a user

Get all users
curl -XGET 'http://localhost:8090/api/user/users'

Add new user
curl -XPOST -H "Content-type: application/json" -d '{
    "name": "test-user",
    "email": "test@live.com".
}' 'http://localhost:8090/api/user/addUser'

Update a user
curl -XPATCH -H "Content-type: application/json" -d '{
    "email": "newMail@live.com"
}' 'http://localhost:8090/api/user/patchUser/1'

Delete a user
curl -XDELETE 'http://localhost:8090/api/user/deleteUser/1'
