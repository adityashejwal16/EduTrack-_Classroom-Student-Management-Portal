package com.marvellous.marvellousFullStack.Service;

import com.marvellous.marvellousFullStack.Entity.BatchEntry;
import com.marvellous.marvellousFullStack.Repository.BatchEntryRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BatchEntryService
{
    @Autowired
    private BatchEntryRepository batchEntryRepository;
    private BatchEntry batchEntry;
    //this.batchEntry = batchEntry;

    // C  :Create   POST
    public void saveEntry(BatchEntry batchEntry)
    {
        this.batchEntry = batchEntry;
        batchEntryRepository.save(batchEntry);
    }

    // R : Read  GET
    public List<BatchEntry> getAll()
    {
        return batchEntryRepository.findAll();
    }

    // R : Read  GET
    public Optional<BatchEntry> findById(ObjectId id)
    {
        return batchEntryRepository.findById(id);
    }

    // D : Delete DELETE
    public void deleteById(ObjectId id)
    {
        batchEntryRepository.deleteById(id);
    }
}













