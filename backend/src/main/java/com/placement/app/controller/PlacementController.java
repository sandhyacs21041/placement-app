package com.placement.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/placement")
@CrossOrigin
public class PlacementController {

    @GetMapping("/predict")
    public String predict(
            @RequestParam int java,
            @RequestParam int aptitude,
            @RequestParam int communication,
            @RequestParam int projects) {

        int total = java + aptitude + communication + projects;
        double percentage = total / 4.0;

        if (percentage >= 75) {
            return "High Chance of Placement (" + percentage + "%)";
        }
        else if (percentage >= 50) {
            return "Medium Chance of Placement (" + percentage + "%)";
        }
        else {
            return "Low Chance of Placement (" + percentage + "%)";
        }
    }
}