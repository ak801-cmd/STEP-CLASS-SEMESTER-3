import java.util.Arrays;

class PlacementCandidate implements Comparable<PlacementCandidate> {

    private String name;
    private double cgpa;
    private int codingScore;

    // Constructor
    public PlacementCandidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    // CGPA-only eligibility
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.0;
    }

    // CGPA + coding score eligibility
    static boolean isEligible(double cgpa, int codingScore) {

        if (cgpa >= 7.0) {
            return true;
        }

        if (cgpa >= 6.5 && codingScore >= 60) {
            return true;
        }

        return false;
    }

    // Composite score
    double getCompositeScore() {
        return cgpa * 10 + codingScore;
    }

    // Ranking
    @Override
    public int compareTo(PlacementCandidate other) {

        return Double.compare(
            other.getCompositeScore(),
            this.getCompositeScore()
        );
    }

    static String shortlistAndRank(PlacementCandidate[] candidates) {

        PlacementCandidate[] shortlisted =
            new PlacementCandidate[candidates.length];

        int count = 0;

        // Shortlist
        for (PlacementCandidate candidate : candidates) {

            if (isEligible(candidate.cgpa, candidate.codingScore)) {
                shortlisted[count] = candidate;
                count++;
            }
        }

        // Create exact-size array
        PlacementCandidate[] result =
            Arrays.copyOf(shortlisted, count);

        // Sort using compareTo()
        Arrays.sort(result);

        // Create output
        String output = "";

        for (int i = 0; i < result.length; i++) {

            output = output
                    + (i + 1)
                    + ". "
                    + result[i].name
                    + " ("
                    + result[i].getCompositeScore()
                    + ")";

            if (i < result.length - 1) {
                output = output + " | ";
            }
        }

        return output;
    }

    public static void main(String[] args) {

        PlacementCandidate[] candidates = {

            new PlacementCandidate("Aisha", 8.2, 40),
            new PlacementCandidate("Rohit", 6.8, 65),
            new PlacementCandidate("Meena", 6.0, 90),
            new PlacementCandidate("Karan", 7.5, 20)
        };

        System.out.println(
            shortlistAndRank(candidates)
        );
    }
}