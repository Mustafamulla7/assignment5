// Author : Mustafa Mulla
// Roll No : 26
// Title : Goa legistalive assembly
// Start date : 07/10/2024
// Modified date :  11/10/2024
// Description : Goa Legislative Assembly's various sections
import java.util.ArrayList;
import java.util.List;

public class HouseSection extends Goa_legislative implements SectionDisplay {
    private List<Subsection> subsections;

    public HouseSection() {
        super("House");
        this.subsections = new ArrayList<>();

        subsections.add(new Subsection("Session Information"));
        subsections.add(new Subsection("Question List"));
        subsections.add(new Subsection("Assembly Bills"));
        subsections.add(new Subsection("Papers laid in the house"));
    }

    @Override
    public List<Subsection> getSubsections() {
        return subsections;
    }

    @Override
    public void showSectionDetails() {
        System.out.println("House Section:");
        for (Subsection subsection : subsections) {
            System.out.println("- " + subsection.getSubsectionName());
        }
    }
}

