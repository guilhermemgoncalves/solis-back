package com.solis.landing.page.section.about;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class SectionAboutServiceImpl implements  SectionAboutService{
    @Override
    public SectionAboutRecord save(SectionAboutRecord section) {
        return this.mock();
    }

    @Override
    public SectionAboutRecord get() {
        return this.mock();
    }


    private SectionAboutRecord mock(){
        List<SectionAboutRecord.ContactItem> contactItems = List.of(
                new SectionAboutRecord.ContactItem("bi bi-linkedin ms-2", "#"),
                new SectionAboutRecord.ContactItem("bi bi-instagram ms-2", "#"),
                new SectionAboutRecord.ContactItem("bi bi-github ms-2", "#"),
                new SectionAboutRecord.ContactItem("bi bi-whatsapp ms-2", "#")
        );

        SectionAboutRecord sectionAboutRecord = new SectionAboutRecord(
                "assets/placeholder.jpeg",
                "Sobre mim",
                contactItems,
                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet\n" +
                        "          aperiam blanditiis debitis dolorum eligendi, id nostrum officiis quae qui reprehenderit repudiandae tenetur.\n" +
                        "          Adipisci architecto impedit odio optio quod ullam, voluptas.",
                List.of("Revit", "AutoCad", "Lumion", "V-ray")
        );

        return sectionAboutRecord;
    }
}
