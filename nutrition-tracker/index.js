// Global variable can be accessed from any function
const globalVariable = `Right now it's ${new Date().toLocaleString()}`;

// A function that is called from the HTML to add some text to the div with id "dummy-data-div"
function populateDummyData() {
    const dummyDataDiv = document.getElementById("dummy-data-div");

    const dummyDataText = document.createElement("strong");
    dummyDataText.innerText = globalVariable;

    dummyDataDiv.appendChild(dummyDataText);
}
