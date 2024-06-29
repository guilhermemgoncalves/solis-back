package com.solis.landing.page.section.about;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class SectionAboutEntity {

    @Id
    String key;
    String image;
    String sectionTitle;
    String shortText;
}
