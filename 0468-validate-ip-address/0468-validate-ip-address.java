class Solution {
    public String validIPAddress(String queryIP) {
        if (queryIP.chars().filter(ch -> ch == '.').count() == 3) {
            return isIPv4(queryIP) ? "IPv4" : "Neither";
        } else if (queryIP.chars().filter(ch -> ch == ':').count() == 7) {
            return isIPv6(queryIP) ? "IPv6" : "Neither";
        } else {
            return "Neither";
        }
    }

    private boolean isIPv4(String ip) {
        String[] parts = ip.split("\\.", -1);  
        if (parts.length != 4) {
            return false;
        }
        for (String part : parts) {
            if (part.length() == 0 || part.length() > 3) {
                return false;
            }
            if (part.charAt(0) == '0' && part.length() > 1) {  
                return false;
            }
            for (char ch : part.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    return false;
                }
            }
            int num = Integer.parseInt(part);
            if (num < 0 || num > 255) {
                return false;
            }
        }
        return true;
    }

    private boolean isIPv6(String ip) {
        String[] parts = ip.split(":", -1);  
        if (parts.length != 8) {
            return false;
        }
        for (String part : parts) {
            if (part.length() == 0 || part.length() > 4) {
                return false;
            }
            for (char ch : part.toCharArray()) {
                if (!Character.isDigit(ch) && !isHexChar(ch)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isHexChar(char ch) {
        return (ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F') || (ch >= '0' && ch <= '9');
    }
}
