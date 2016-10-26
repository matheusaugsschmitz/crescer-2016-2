class Heroi{
  constructor(){
    for (let i = 0; i < arguments.length; i++) {
      this.comics = arguments[i]['comics'];
      this.description = arguments[i]['description'];
      this.events = arguments[i]['events'];
      this.id = arguments[i]['id'];
      this.modified = arguments[i]['modified'];
      this.name = arguments[i]['name'];
      this.resourceURI = arguments[i]['resourceURI'];
      this.series = arguments[i]['series'];
      this.stories = arguments[i]['stories'];
      this.thumbnail = arguments[i]['thumbnail'];
      this.urls = arguments[i].urls;
    }
  }
}
