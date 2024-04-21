import java.util.HashMap;
import java.util.Map;

class TelcoAllowance implements UsagePromo {
    private Map<String, String> dataAllowanceDetails;

    public TelcoAllowance() {
        dataAllowanceDetails = new HashMap<>();
        dataAllowanceDetails.put("Smart", "15 GB for ₱500 per month.");
        dataAllowanceDetails.put("Globe", "10 GB for ₱450 per month with unlimited calls and texts to Globe subscribers.");
        dataAllowanceDetails.put("Ditto", "8 GB for ₱400 per month with unlimited calls and texts to all networks.");
    }

    @Override
    public String showAllowance(String telcoName, double price) {
        return dataAllowanceDetails.getOrDefault(telcoName, "No data allowance details found for " + telcoName);
    }
}
