package com.example.cs473_6.data


import java.util.*

class Job(
    var name: String,
    var companyName: String,
    var description: String
) {

    companion object {

        @JvmStatic
        fun createExperienceList(): ArrayList<Job> {
            val jobs = ArrayList<Job>()
            jobs.add(Job("Founder, CEO & Lead Designer", "SpaceX - Space Exploration Technologies" +
                    "", "Successfully launched Falcon Heavy, the most powerful operationa\n" +
                    "rocket in the world by a factor of two, with the ability to lift into\n" +
                    "orbit nearlv 64 metric tons 141.000 b) - a mass greater than a\n" +
                    "13/ jetliner loaded with passengers, crew, luggage and ruel."))
            jobs.add(Job("Founder", "The Boring Company" +
                    "", "Raised \$10m by selling 20.000 flamethrowers in 4 days.\n" +
                    "\" Raised \$1m by selling 50.00 baseball caps.\n" +
                    "Hyperloop - an ultra high-speed underground public\n" +
                    "transportation system in which passengers are transported on\n" +
                    "autonomous electric pods traveling at 600+ miles per hour in ¿\n" +
                    "pressurized caoin."))
            jobs.add(Job("CEO and Product Architect", "Tesla Inc." +
                    "", "Global sales passed 250,000 units in September 2017.\n" +
                    "- Consumer Reports named Tesla as the top American car brand and\n" +
                    "ranked it 8th among global carmakers in February 2017. C\n" +
                    "I Consumer Reports Annual Owner Satisraction Survev at\n" +
                    "91% in 2016."))
            jobs.add(Job("Co-founder and Former Chairman", "SolarCity (subsidiary of Tesla Inc.)" +
                    "", "Merged the company with Tesla Inc. and now offers energy\n" +
                    "storage services through Tesla, including a turnkey residential\n" +
                    "battery backup service that incorporates Tesla's Powerwall.\n" +
                    "- In 2015, installed 870MW of solar power, approximately 28% of\n" +
                    "non-utility solar installation in the U.S. that year. C"))
            jobs.add(Job("Founder & CEO", "Neurolink" +
                    "", "A companv aIms to make devices to treat serous\n" +
                    "San Francisco. USA\n" +
                    "diseases in the short-term. with the eventual doal or human\n" +
                    "enhancement."))
            return jobs
        }
    }
}