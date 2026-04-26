package com.chatbot.repository;

import org.springframework.stereotype.Repository;

import com.chatbot.model.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {
    // JpaRepository provides basic CRUD operations, so no need to define methods here

}