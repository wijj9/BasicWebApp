package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 28 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("name")) {
           return "BigUnit";
        } else if (query.contains("what is ") && query.contains("plus")) {
            String[] a = query.split(" ");
            int r = Integer.parseInt(a[2]) + Integer.parseInt(a[4]);
            return String.valueOf(r);
        }
        else if (query.contains("which of the following numbers is the largest:")) {
            return "";
        } else if (query.contains("multiplied")) {
            String[] q = query.split(" ");
            int result = Integer.parseInt(q[2]) * Integer.parseInt(q[5]);
            return String.valueOf(result);
        }
        else {
            return "";
        }
    }
}
