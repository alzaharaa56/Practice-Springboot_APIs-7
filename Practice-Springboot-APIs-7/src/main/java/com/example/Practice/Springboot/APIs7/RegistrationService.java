package com.example.Practice.Springboot.APIs7;



import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RegistrationService {

    private Map<Integer, EventRegistration> registrations = new HashMap<>();


    public void loadSampleRegistrations() {
        registrations.put(101, new EventRegistration(101, "Ahmed"));
        registrations.put(102, new EventRegistration(102, "Sara"));
        registrations.put(103, new EventRegistration(103, "John"));
        registrations.put(104, new EventRegistration(104, "Mary"));
    }


    public Map<String, Object> deleteMultipleByIds(List<Integer> ids) {
        List<Integer> deletedIds = new ArrayList<>();
        List<Integer> notFoundIds = new ArrayList<>();

        for (Integer id : ids) {
            if (registrations.containsKey(id)) {
                registrations.remove(id);
                deletedIds.add(id);
            } else {
                notFoundIds.add(id);
            }
        }


        Map<String, Object> response = new HashMap<>();
        response.put("message", "Bulk Deletion Completed");
        response.put("totalRequested", ids.size());
        response.put("deletedCount", deletedIds.size());
        response.put("deletedIds", deletedIds);
        response.put("notFoundIds", notFoundIds);

        return response;
    }


    public Map<Integer, EventRegistration> getAllRegistrations() {
        return registrations;
    }
}

