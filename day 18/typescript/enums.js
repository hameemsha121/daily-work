var Direction;
(function (Direction) {
    Direction[Direction["north"] = 0] = "north";
    Direction[Direction["south"] = 5] = "south";
    Direction[Direction["east"] = 6] = "east";
    Direction[Direction["west"] = 7] = "west";
})(Direction || (Direction = {}));
var PrintMedia;
(function (PrintMedia) {
    PrintMedia[PrintMedia["Newspaper"] = 1] = "Newspaper";
    PrintMedia[PrintMedia["Newsletter"] = 2] = "Newsletter";
    PrintMedia[PrintMedia["Magazine"] = 3] = "Magazine";
    PrintMedia[PrintMedia["Book"] = 4] = "Book";
})(PrintMedia || (PrintMedia = {}));
function getMedia(mediaName) {
    if (mediaName === 'Forbes' || mediaName === 'Outlook') {
        return PrintMedia.Magazine;
    }
}
var mediaType = getMedia('Forbes');
console.log(mediaType); // returns Magazine
