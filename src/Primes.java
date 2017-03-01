import java.util.ArrayList;
import java.util.List;

public class Primes {
	
	//Sieve of Eratosthenes
	public List<Integer> getPrimes(int limit) {
		List<Integer> result = new ArrayList<>();
		if (limit < 2) {
			return result;
		}
		
		boolean[] crossedOut = new boolean[limit + 1];
		crossedOut[0] = true;
		crossedOut[1] = true;
		int iterationLimit = (int) Math.sqrt((double) limit);
		
		for (int i = 2; i <= iterationLimit + 1; i++) {
			if (!crossedOut[i]) {
				result.add(i);
				crossOutMultiplies(i, crossedOut);
			}
		}
		for (int i = iterationLimit + 1; i <= limit; i++) {
			if (!crossedOut[i]) {
				result.add(i);
			}
		}
		
		return result;
	}

	private void crossOutMultiplies(int prime, boolean[] crossedOut) {
		for (int i = 2*prime; i < crossedOut.length; i += prime) {
			crossedOut[i] = true;
		}
	}
}
