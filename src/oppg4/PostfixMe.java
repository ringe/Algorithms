package oppg4;
import java.util.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class PostfixMe {
	public static String expression = "1 4 + 3 * 4 + 6 /";
	public static ScriptEngineManager mgr = new ScriptEngineManager();
    public final static ScriptEngine engine = mgr.getEngineByName("JavaScript");
	
	/**
	 * @param args
	 * @throws ScriptException 
	 */
	public static void main(String[] args) throws ScriptException {
		Stack<String> st = new Stack<String>();
		System.out.println("Postfix notation: " + expression);
		
		// Koden under scanner et uttrykk
		// Hent ut operander og operatorer fra uttrykket
		// Uttrykket ligger i strengen expression
		// operandstack er vår stack
		StringTokenizer tokens = new StringTokenizer(expression, " +-/*%", true);
		String expr = "";
		boolean first = true;  
		
		// Fase 1, scan for tokens
		while (tokens.hasMoreTokens()) {
			String token = tokens.nextToken().trim(); // ekstraher et token
			if (token.length() == 0) { // mellomrom
				continue; // neste token
			}
			else if (token.charAt(0) == '+' || token.charAt(0) == '-' || token.charAt(0) == '*' || token.charAt(0) == '/') {
				// Henter tall fra stack
				String b = st.pop();
				String a = st.pop();
				
				// Setter sammen det matematiske uttrykket 
				String math = a + token + b;
				
				// Behandler uttrykket for utskrift
				if (first)
					expr += math;
				else
					expr = "(" + expr + ")" + token + b;
				
				// Analyser matteuttrykk, legg resultatet på stack 
				String c = engine.eval(math).toString();
				st.push(c);
				
				// Ikke første kjøring heretter
				first = false;
			}
			else { // En operand funnet
				// legg på stack
				st.push(token);
			}
		}
		System.out.println(expr + " gives " + st.pop());

	}
}
