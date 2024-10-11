// Author : Mustafa Mulla
// Roll No : 26
// Title : Goa legistalive assembly
// Start date : 07/10/2024
// Modified date :  11/10/2024
// Description : Goa Legislative Assembly's various sections
import java.util.ArrayList;
import java.util.List;

public class LegislatureSection extends Goa_legislative implements SectionDisplay {
    private List<Subsection> subsections;

    public LegislatureSection() {
        super("Legislature");
        this.subsections = new ArrayList<>();

        subsections.add(new Subsection("Speaker : Shri. Ramesh Tawadkar"));
        subsections.add(new Subsection("Deputy Speaker : Shri. Joshua De Souza"));
        subsections.add(new Subsection("Secretary : Smt. Namrata Ulman"));
    }

    @Override
    public List<Subsection> getSubsections() {
        return subsections;
    }

    @Override
    public void showSectionDetails() {
        System.out.println("Legislature Section:");
        for (Subsection subsection : subsections) {
            System.out.println("- " + subsection.getSubsectionName());
        }
    }
}
