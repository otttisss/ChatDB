package edu.school21.chat.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Message {
    private Long id;
    private User author;
    private Chatroom room;
    private String text;
    private LocalDateTime timestamp;

    public Message(Long id, User author, Chatroom room, String text, LocalDateTime timestamp) {
        this.id = id;
        this.author = author;
        this.room = room;
        this.text = text;
        this.timestamp = timestamp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author, room, text, timestamp);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Message message = (Message) obj;

        return Objects.equals(id, message.id) && Objects.equals(author, message.author) &&
                Objects.equals(room, message.room) && Objects.equals(text, message.text) && Objects.equals(timestamp, message.timestamp);
    }

    @Override
    public String toString() {
        return "Message: {\n" +
                "id=" + id +
                ",\nauthor=" + author +
                ",\nroom=" + room +
                ",\ntext='" + text + '\'' +
                ",\ntime=" + timestamp +
                "\n}";
    }

    public Long getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public Chatroom getRoom() {
        return room;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setRoom(Chatroom room) {
        this.room = room;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

