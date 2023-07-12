# ChatDB
Implementation of Chat database with using JDBC driver

*Stack: Java 8, Maven, JDBC, HikariCP, Postgresql.*

In this chat, user can create or choose an existing chatroom. Each chatroom can have several
users exchanging messages. 

*Key domain models which both SQL tables and Java classes must be implemented for are:*

User:
  User ID
  Login
  Password
  List of created rooms
  List of chatrooms

Chatroom:
  Chatroom id
  Chatroom name
  Chatroom owner
  List of messages in chatroom

Message:
  Message id
  Message author
  Message room
  Message text
  Message date/time
