import java.util.HashMap;
import java.util.Map;

class UnliCallTextPackage implements UnliCallTextOffer {
    private Map<String, String> unliCallTextDetails;

    public UnliCallTextPackage() {
        unliCallTextDetails = new HashMap<>();
        unliCallTextDetails.put("Smart", "No unlimited calls and texts.");
        unliCallTextDetails.put("Globe", "Unlimited calls and texts within Globe network.");
        unliCallTextDetails.put("Ditto", "Unlimited calls and texts to all networks.");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliCallTextDetails.getOrDefault(telcoName, "No unlimited calls and texts offer details found for " + telcoName);
    }
}