package com.mpec.sms.Controller;


import com.mpec.sms.Model.Instructor;
import com.mpec.sms.Service.InstructorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InstructorController {
    private InstructorService instructorService;
    public InstructorController(InstructorService instructorService) {
        super();
        this.instructorService = instructorService;
    }
    @GetMapping("/instructors")
    public String listInstructors(Model model) {
        model.addAttribute("instructors", instructorService.getAllInstructors());
        return "instructors";
    }
    @GetMapping("/instructors/new")
    public String createInstructorForm(Model model) {
        Instructor instructor = new Instructor();
        model.addAttribute("instructor", instructor);
        return "create_instructor";
    }
    @PostMapping("/instructors")
    public String saveInstructor(@ModelAttribute("instructor") Instructor instructor) {
        instructorService.saveInstructor(instructor);
        return "redirect:/instructors";
    }
    @GetMapping("/instructors/edit/{id}")
    public String editInstructor(@PathVariable Long id, Model model) {
        model.addAttribute("instructor", instructorService.getInstructorById(id));
        return "edit_instructor";
    }
    @PostMapping("/instructors/{id}")
    public String updateInstructor(@PathVariable Long id,
                                   @ModelAttribute("instructor") Instructor instructor,
                                   Model model) {
        Instructor existingInstructor = instructorService.getInstructorById(id);
        existingInstructor.setId(id);
        existingInstructor.setFirstName(instructor.getFirstName());
        existingInstructor.setLastName(instructor.getLastName());
        existingInstructor.setAddress(instructor.getAddress());
        existingInstructor.setEmail(instructor.getEmail());

        instructorService.updateInstructor(existingInstructor);
        return "redirect:/instructors";
    }
    @GetMapping("/instructors/{id}")
    public String deleteInstructor(@PathVariable Long id) {
        instructorService.deleteInstructorById(id);
        return "redirect:/instructors";
    }
}
