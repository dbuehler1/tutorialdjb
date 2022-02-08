package edu.wctc.tutorialdjb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TutorialController {
    @RequestMapping("/tutorials/stepOne")
    public String showStepOne() {
        return "pages/tutorialStepOne";
    }

    @RequestMapping("/tutorials/stepTwo")
    public String showStepTwo() {
        return "pages/tutorialStepTwo";
    }

    @RequestMapping("/tutorials/stepThree")
    public String showStepThree() {
        return "pages/tutorialStepThree";
    }

    @RequestMapping("/tutorials/stepFour")
    public String showStepFour() {
        return "pages/tutorialStepFour";
    }
}

