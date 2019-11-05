package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {

    TimeEntry find(Object id);

    TimeEntry update(Object id, TimeEntry timeEntry);

    void delete(Object id);

    List<TimeEntry> list();

    TimeEntry create(TimeEntry any);
}
