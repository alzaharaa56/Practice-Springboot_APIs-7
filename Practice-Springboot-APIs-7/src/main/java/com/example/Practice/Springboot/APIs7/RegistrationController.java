package com.example.Practice.Springboot.APIs7;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class RegistrationController {


        private final RegistrationService registrationService;

        public RegistrationController(RegistrationService registrationService) {
            this.registrationService = registrationService;
            registrationService.loadSampleRegistrations();
        }

        @DeleteMapping("/registrations")
        public Map<String, Object> deleteRegistrations(@RequestParam List<Integer> ids) {
            return registrationService.deleteMultipleByIds(ids);
        }


        @GetMapping("/registrations")
        public Object viewRegistrations() {
            return registrationService.getAllRegistrations();
        }
    }


