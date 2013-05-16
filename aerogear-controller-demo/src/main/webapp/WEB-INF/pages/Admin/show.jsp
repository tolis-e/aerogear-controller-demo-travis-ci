<%--~
  ~ JBoss, Home of Professional Open Source
  ~ Copyright Red Hat, Inc., and individual contributors
  ~ by the @authors tag. See the copyright.txt in the distribution for a
  ~ full listing of individual contributors.
  ~
  ~ Licensed under the Apache License, Version 2.0 (the "License");
  ~ you may not use this file except in compliance with the License.
  ~ You may obtain a copy of the License at
  ~ http://www.apache.org/licenses/LICENSE-2.0
  ~ Unless required by applicable law or agreed to in writing, software
  ~ distributed under the License is distributed on an "AS IS" BASIS,
  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~ See the License for the specific language governing permissions and
  ~ limitations under the License.
  --%>

<jsp:include page="../../template/header.jsp" />
<%@page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <div class="sixteen columns">
        <h1 class="remove-bottom" style="margin-top: 40px">Restricted Admin page</h1>
        <hr />
    </div>
    <div class="sixteen columns">
        <p> <a href="${pageContext.request.contextPath}/logout">Logout</a></p>
        <form action="remove" method="post">
            <p>${aeroGearUser.username}</p>
            <input type="hidden" id="aeroGearUser.username" name="aeroGearUser.username" value="${aeroGearUser.username}">
            <input type="submit" value="Delete"/> or go <a href="../admin">back</a>.
        </form>

    </div>

</div>
<jsp:include page="../../template/footer.jsp" />