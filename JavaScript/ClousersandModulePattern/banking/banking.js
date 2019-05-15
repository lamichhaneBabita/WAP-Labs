(function () {
    "use strict"
    var userAccount = (function () {
        let acct;
        let deposit;
        return {
            account: function (name, depositeAmnt) {
                acct = name;
                deposit = depositeAmnt;
                return { name: acct, deposit: deposit };
            }
        }
    })();

    var userInfoList = [];
    function createUserAccount() {
        const accountinfo = userAccount.account((document.getElementById("accountName").value), (document.getElementById("deposit").value));
        userInfoList.push(accountinfo);
        for (const account of userInfoList)
            document.getElementById("display").value += `Account name:  ${account.name}, Deposit:  ${account.deposit}`;


    }

    window.onload = function () {
        document.getElementById("create").onclick = createUserAccount;
    };
})();
