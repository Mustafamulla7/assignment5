// Author : Mustafa Mulla
// Roll No : 26
// Title : Goa legistalive assembly
// Start date : 07/10/2024
// Modified date :  11/10/2024
// Description : Goa Legislative Assembly's various sections
import java.util.ArrayList;
import java.util.List;

public class GovernmentSection extends Goa_legislative implements SectionDisplay {
    private List<Subsection> subsections;

    public GovernmentSection() {
        super("Government");
        this.subsections = new ArrayList<>();

        subsections.add(new Subsection("Governor : Shri. P. S. Sreedharan Pillai"));
        subsections.add(new Subsection("Chief Minister : Shri. Pramod Sawant"));
    }

    @Override
    public List<Subsection> getSubsections() {
        return subsections;
    }

    @Override
    public void showSectionDetails() {
        System.out.println("Government Section:");
        for (Subsection subsection : subsections) {
            System.out.println("- " + subsection.getSubsectionName());
        }
    }
}
