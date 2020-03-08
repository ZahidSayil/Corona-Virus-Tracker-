package com.viz.ai.cvt.controllers;

;

import com.viz.ai.cvt.model.LocationStats;
import com.viz.ai.cvt.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
//@RequestMapping(value = "/api/cvd")
public class HomeController {

    @Autowired
    private CoronaVirusDataService coronaVirusDataService;

//    @GetMapping("/")
//    public String home(Model model) {
//        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
//        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
//        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
//        model.addAttribute("locationStats", allStats);
//        model.addAttribute("totalReportedCases", totalReportedCases);
//        model.addAttribute("totalNewCases", totalNewCases);
//
//        return "home";
//    }
@GetMapping("/")
    public Iterable<LocationStats> displayAllStats() {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        //int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        //int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();

        return allStats;
    }
}
