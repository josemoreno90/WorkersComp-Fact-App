package me.josefmoreno.freshfacts;

import java.util.Random;

public class FactBook {
    // Fields or Member Variables - Properties about the object
    String[] facts = {
            "Utilization review (UR) is the process used by employers or claims administrators to review treatment to determine if it is medically necessary.  All employers or claims administrators handling their workers’ compensation claims are required by law to have a UR program. This program uses medical treatment guidelines set by the state to decide whether or not to approve medical treatment recommended by your doctor.",
            "Though you are able to legally represent yourself on a workers' compensation case, it is substantially more likely you will receive a fair case with someone who specializes in the law and process of a workers' compensation case.  ",
            "Any time one is injured while implementing work related duties they may be entitled to workers' compensation.  These include repetitive tasks or even abrupt accidents can constitute a workers' compensation injury.",
            "Time limit for reporting a workers' compensation injury is 30 days.  After those 30 days, the injured worker has 1 year (in special circumstances up to 5) to file the workers' payment claim through the WCAB",
            "Your employer is never allowed to fire you for filing a workers' payment claim. ",
            "Generally, your first check can be expected within 21 days since reporting your duty, once a doctor says you must perform modified (or none) work, and the employer cannot offer any modified work."
    };

    // Methods - Actions the object can take
    public String getFact() {
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    };
}
