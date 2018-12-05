# coding:utf-8
class Solution:

    def romanToInt(self, s):
        """

        :param s: str
        :return: int
        """
        roman = {'M': 1000, 'D': 500, 'C': 100, 'L': 50, 'X': 10, 'V': 5, 'I': 1}

        ans = roman[s[len(s) - 1]]

        for i in range(len(s) - 1):
            if roman[s[i]] < roman[s[i + 1]]:
                ans -= roman[s[i]]
            else:
                ans += roman[s[i]]
        return ans
