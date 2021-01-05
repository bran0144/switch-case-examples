// First line does not break, so 212, 247,646, 718 will all have 
// "New York City" as the location
// 917 will have "Cellular" and "New York City" appended because of no break
// There is also a default at the end

String location = "";
switch(code) {
    case 917: location = "Cellular: ";
    case 212:
    case 347:
    case 646:
    case 718: location += "New York City"; break;

    case 315: location = "Syracuse"; break;

    case 516: location = "Nassau County"; break;

    case 518: location = "Albany"; break;

    case 585: location = "Rochester"; break;

    case 607: location = "South Central New York"; break;

    case 631: location = "Suffolk County"; break;

    case 716: location = "Buffalo"; break;

    case 845: location = "Lower Hudson Valley"; break;

    case 914: location = "Westchester County"; break;

    default:  location = "Unknown Area Code"; break;
}