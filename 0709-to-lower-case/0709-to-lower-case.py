class Solution(object):
    def toLowerCase(self, s):
        """
        :type s: str
        :rtype: str
        """
        result = []
        for i in range(len(s)):
            if 'A' <= s[i] <= 'Z':
                result.append(chr(ord(s[i]) + 32))
            else:
                result.append(s[i])
                
        return ''.join(result)
