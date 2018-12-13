# ServletCookies

>Cookies in Servlet

A cookie is a small piece of information that is persisted between the multiple client requests.
A cookie has a name, a single value, and optional attributes such as a comment, path and domain qualifiers, a maximum age, and a version number.

>How Cookie works

By default, each request is considered as a new request. In cookies technique, we add cookie with response from the servlet.
So cookie is stored in the cache of the browser. After that if request is sent by the user, cookie is added with request by default.
Thus, we recognize the user as the old user.

>Types of Cookie

There are 2 types of cookies in servlets.

Non-persistent cookie  -  It is valid for single session only. It is removed each time when user closes the browser.
Persistent cookie  -  It is valid for multiple session . It is not removed each time when user closes the browser. It is removed only if user logout or signout.

Advantages

-Simplest technique of maintaining the state.
-Cookies are maintained at client side.

Disadvantage 

-It will not work if cookie is disabled from the browser.
-Only textual information can be set in Cookie object.

