package com.solis.landing.page.section.about;

import java.util.List;

public record SectionAboutRecord(
        String image,
        String sectionTitle,
        List<ContactItem> contactItems,
        String shortText,
        List<String> technologyNames
) {
    public record ContactItem(String icon, String link) {
    }

}