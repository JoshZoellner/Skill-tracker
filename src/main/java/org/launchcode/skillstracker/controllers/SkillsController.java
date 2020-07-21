package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsTracker() {

        String html =
                "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Skills to Learn</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Typescript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
        return html;
    }

//    At localhost:8080/form, add a form that lets the user enter their name and
//    choose their favorite, second favorite, and third favorite programming languages
//    on your list. Use select elements for each of the rankings. Just as with the exercises,
//    we will use @GetMapping()

    @GetMapping("form")
    @ResponseBody
    public String skillsTrackerForm() {

        String html =
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>Skills to Learn</h2>" +

                        "<form method = 'post' action = '/success'>" +
                        "<label>Enter your name: <input type = 'text' name = 'username' /></label>" +
                        "<br>" +

                        "<label>Choose a skill:" +
                        "<select name='firstSkill'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "<option value='Typescript'>Typescript</option>" +
                        "</select></label>" +
                        "<br>" +

                        "<label>Choose a skill:" +
                        "<select name='secondSkill'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "<option value='Typescript'>Typescript</option>" +
                        "</select></label>" +
                        "<br>" +

                        "<label>Choose a skill:" +
                        "<select name='thirdSkill'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='Javascript'>Javascript</option>" +
                        "<option value='Typescript'>Typescript</option>" +
                        "</select></label>" +
                        "<br>" +

                        "<input type = 'submit' value = 'Show me the skills!'/>" +

                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }


    @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value=("success"))
    @ResponseBody
    public String skillsTrackerSuccess(
            @RequestParam String username,
            @RequestParam String firstSkill,
            @RequestParam String secondSkill,
            @RequestParam String thirdSkill) {

        String html =
                "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker for " + username + "</h1>" +
                        "<h2>Skills to Learn</h2>" +
                            "<ol>" +
                                "<li>" + firstSkill +"</li>" +
                                "<li>" + secondSkill + "</li>" +
                                "<li>" + thirdSkill + "</li>" +
                            "</ol>" +
                    "</body>" +
                "</html>";
        return html;
    }

}
