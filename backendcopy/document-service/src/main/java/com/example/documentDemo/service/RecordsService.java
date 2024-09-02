package com.example.documentDemo.service;

import com.example.documentDemo.mapper.RecordsMapper;
import com.example.documentDemo.model.Records;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class RecordsService {

    @Autowired
    private RecordsMapper recordsMapper;

    public List<Records> getRecords(int userId) {
        return recordsMapper.getRecords(userId);
    }

    public void deleteRecords(int userId, int documentId) {
        recordsMapper.deleteRecords(userId, documentId);
    }

    public void InsertRecords(int userID, int documentID){
        recordsMapper.InsertRecords(userID, documentID);}
}