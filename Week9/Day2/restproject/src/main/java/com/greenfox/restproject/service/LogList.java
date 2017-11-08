package com.greenfox.restproject.service;

import com.greenfox.restproject.model.Log;

import java.util.ArrayList;
import java.util.List;

public class LogList {

    private List<Log> entries;
    private long entryCount;

    public LogList(List<Log> entries, long entryCount) {
        this.entries = entries;
        this.entryCount = entryCount;
    }

    public LogList() {
        this.entryCount=0;
        this.entries = new ArrayList<>();
    }

    public List<Log> getEntries() {
        return entries;
    }

    public void setEntries(List<Log> entries) {
        this.entries = entries;
    }

    public long getEntryCount() {
        return entryCount;
    }

    public void setEntryCount(long entryCount) {
        this.entryCount = entryCount;
    }

    public void addEntry(Log log) {
        this.entries.add(log);
    }

}