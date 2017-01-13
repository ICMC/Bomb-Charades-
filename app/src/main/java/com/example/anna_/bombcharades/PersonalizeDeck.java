package com.example.anna_.bombcharades;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by anna_ on 1/4/2017.
 */

public class PersonalizeDeck extends Activity {

    //wordlists for the game
    String[] computerScience = {"Algorithm", "Analog", "App", "Application", "Array", "Backup", "Bandwidth", "Binary", "Bit", "Bitmap", "Bite", "Blog", "Blogger", "Bookmark", "Boot", "Broadband", "Browser", "Buffer", "Bug", "Bus", "Byte", "Cache", "Caps Lock", "Captcha", "Cd", "Cd-Rom", "Client", "Clip Art", "Clip Board", "Cloud Computing", "Command", "Compile", "Compress", "Computer", "Computer Program", "Configure", "Cookie", "Copy", "Cpu ", "Cybercrime", "Cyberspace", "Dashboard", "Data", "Database", "Data Mining", "Debug", "Decompress", "Delete", "Desktop", "Development", "Digital", "Disk", "Dns ", "Document", "Domain", "Domain Name", "Dot", "Dot Matrix", "Download", "Drag", "Dvd ", "Dynamic", "Email", "Emoticon", "Encrypt", "Encryption", "Enter", "Exabyte", "Faq", "File", "Finder", "Firewall", "Firmware", "Flaming", "Flash", "Flash Drive", "Floppy Disk", "Flowchart", "Folder", "Font", "Format", "Frame", "Freeware", "Gigabyte", "Graphics", "Hack", "Hacker", "Hardware", "Home Page", "Host", "Html", "Hyperlink", "Hypertext", "Icon", "Inbox", "Integer", "Interface", "Internet", "Ip Address", "Iteration", "Java", "Joystick", "Junk Mail", "Kernel", "Key", "Keyboard", "Keyword", "Laptop", "Laser Printer", "Link", "Login", "Log Out", "Logic", "Lurking", "Mainframe", "Macro", "Malware", "Media", "Memory", "Mirror", "Modem", "Monitor", "Motherboard", "Mouse", "Multimedia", "Net", "Network", "Node", "Notebook Computer", "Offline", "Online", "Open Source", "Operating System", "Option", "Output", "Page", "Password", "Paste", "Path", "Phishing", "Piracy", "Pirate", "Platform", "Plug-In", "Podcast", "Pop-Up", "Portal", "Print", "Printer", "Privacy", "Process", "Program", "Programmer", "Protocol", "Queue", "Qwerty", "Ram ", "Real-Time", "Reboot", "Resolution", "Restore", "Rom ", "Root", "Router", "Runtime", "Save", "Scan", "Scanner", "Screen", "Screenshot", "Script", "Scroll", "Scroll Bar", "Search Engine", "Security", "Server", "Shareware", "Shell", "Shift", "Shift Key", "Snapshot", "Social Networking", "Software", "Spam", "Spammer", "Spreadsheet", "Status Bar", "Storage", "Spyware", "Supercomputer", "Surf", "Syntax", "Table", "Tag", "Template", "Terabyte", "Teminal", "Text Editor", "Thread", "Toolbar", "Trash", "Trojan Horse", "Typeface", "Undo", "Unix", "Upload", "User Interface", "Username", "Url", "User", "Utility", "Version", "Virtual", "Virtual Memory", "Virus", "Web", "Web Host", "Webmaster", "Website", "Widget", "Window", "Wireless", "Wiki", "Word Processor", "Workstation", "World Wide Web", "Worm", "Www", "Xml", "Zip"
    };
    String[] astronomy = {"Albedo","Alpha Centauri","Apastron","Aperature","Aphelion","Apogee","Asterism","Asteroid","Astronaut","Astronomer","Astronomical Unit","Astronomy","Axial Tilt","Azimuth","Background Radiation","Bailey'S Beads","Big Bang Theory","Binary Star","Black Body","Black Hole","Bolometer","Celestial","Celestial Equator","Cislunar","Cluster","Comet","Conjunction","Constellation","Coriolis Force","Cosmic Rays","Corona","Cosmology","Cosmonaut","Cosmos","Crater","Crescent Moon","Dark Matter","Day","Declination","Deep Space","Deneb","Density","Docking","Doppler Shift","Double Star","Drake Equation","Dust","Dwarf Planet","Dwarf Star","Earth","Earthbound","Eccentricity","Eclipse","Ecliptic","Elliptical Orbit","Equinox","Escape Velocity","Event Horizon","Exoplanet","Extragalaxtic","Falling Star","Flare","Flyby","Free Fall","Full Moon","Galaxy","Gamma Ray","Gas Giant","Gegenschein","Geostationary","Geosynchronous","Gibbous Moon","Globular Cluster","Gravitation","Gravitational Constant","Gravitational Lens","Gravity","Half Moon","Heliocentric","Hydrogen","Helium","H-R Diagram","Hubble Telescope","Hubble'S Law","Hyperbolic Orbit","Hypernova","Ice Giant","Inclination","Inertia","Inferior Planets","Inner Planets","Interstellar","Interstellar Dust","Ionosphere","Jupiter","Kepler'S Laws","Kiloparsec","Kirkwood Gaps","Kuiper Belt","Lagrange Points","Lens","Light-Year","Local Arm","Local Group","Lunar","Magnitude","Mare","Mars","Mass","Mercury","Meteor","Meteor Shower","Meteorite","Meteoroid","Milky Way","Minor Planet","Mir","Moon","Muttnik","Nadir","Nasa","Nebula","Neptune","Neutron Star","New Moon","North Star","Nova","Observatory","Occultation","Oort Cloud","Opposition","Orbit","Orbital Eccentricity","Orbital Inclination","Outer Planets","Parallax","Parsec","Partial Eclipse","Penumbra","Perigee","Perihelion","Perturbation","Phase","Plane Of The Ecliptic","Planet","Planetary Nebula","Planetoid","Pluto","Pole Star","Precession","Probe","Pulsar","Quarter Moon","Quasar","Radiant","Radiation","Red Dwarf","Red Giant Star","Red Shift","Revolve","Right Ascension","Rings","Roche Limit","Rocket","Satellite","Saturn","Scientific Notation","Scintillation","Shooting Star","Solar","Sidereal","Singularity","Sky","Solar","Solar System","Solar Wind","Solstice","Space","Space Exploration","Space Station","Spectroscope","S Cont.","Spectrum","Sputnik","Star","Starlight","Sun","Sunspot","Superior Planets","Supernova","Synodic","Syzygy","Telemetry","Telescope","Terminator","Terrestrial","Total Eclipse","Totality","Transit","Translunar","Transneptunians","Twinkling","Umbra","Universe","Uranus","Vacuum","Van Allen Belt","Variable Star","Venus","Vernal Equinox","Visual Magnitude","Waning","Wavelength","Waxing","Weightlessness","White Dwarf","White Giant","Wormhole","X-Rays","Yellow Dwarf","Zenith","Zodiac"
    };
    String[] biology = {"Absorption","Achromatic","Adaptation","Aerobic","Algae","Alimentary","Allergy","Amoeba","Amphibian","Analogue","Anatomy","Ancestor","Antibody","Appendage","Aquatic","Arboreal","Asexual","Assimilation","Atrophy","Auditory","Backbone","Bacteria","Balance","Barrier","Benign","Biology","Biome","Bisect","Botany","Branch","Breathe","Carnivorous","Catalyst","Cavity","Cell","Chlorophyll","Cholesterol","Chromatic","Chromosome","Cilia","Classification","Cohesive","Collagen","Communicable","Community","Contraction","Control","Convolution","Coronary","Cyclic","Darwin","Deciduous","Decomposition","Dermis","Develop","Dichotomous","Dietary","Differentiation","Diffusion","Digestion","Dinosaur","Discipline","Displacement","Division","DNA","Dominant","Dormant","Ecology","Ecosystem","Ectoplasm","Edema","Embryo","Endangered","Endemic","Endoskeleton","Endothermic","Energy","Environment","Enzyme","Epidermis","Erosion","Essential","Estrogen","Evolution","Exoskeleton","Exothermic","Extermination","Extinct","Factor","Feedback","Fertilization","Fetus","Fibrillation","Filament","Fish","Fission","Flower","Food chain","Fossil","Function","Gamete","Gaseous","Gastrin","Genetics","Genome","Genus","Germ","Gestation","Gills","Grafting","Greenhouse effect","Growth","Habitat","Hemoglobin","Herbivore","Heredity","Heterogeneous","Hibernation","Hierarchy","Homogeneous","Hormone","Horticulture","Host","Human","Hybrid","Immunity","Inclusion","Incubate","Ingestion","Inherited traits","Inoculate","Inquiry","Insoluble","Instinct","Insulate","Insulin","Interdependent","Invertebrate","Involuntary","Isolate","Isotope","Juncture","Kinesthesia","Kingdom","Latitude","Leaf","Life cycle","Linkage","Living","Luminescent","Lymph","Malignant","Mammal","Marine","Meiosis","Membrane","Memory","Metabolism","Microbiology","Microscope","Migration","Mildew","Molt","Muscle","Mutation","Mutualism","Natural","Nerve","Neuron","Nitrogen","Nonliving","Nucleus","Omnivorous","Optic","Order","Organs","Osmosis","Ossification","Oviparous","Oxidation","Paleontologist","Parasite","Parasympathetic","Pathogen","Permeable","Photosynthesis","Plankton","Plasma","Platelet","Pollen","Pollution","Portion","Predator","Preserve","Pressure","Producer","Protein","Protoplasm","Pulmonary","Pyramid","Quest","Question","Radial","Receptor","Recessive","Recycling","Reflex","Regeneration","Regulate","Replicate","Repress","Reptile","Residual","Resource","Respiration","Restriction","RH factor","Root","Scope","Secrete","Seed","Sensor","Shelter","Skeleton","Skin","Solar","Spatial","Species","Specimen","Statistics","Stimulus","Stress","Structure","Symbiosis","Symmetry","Synapse","System","Taste","Taxonomy","Tendril","Terrestrial","Tissue","Tolerance","Toxin","Transformation","Transpiration","Tundra","Turgid","Unsaturated","Vacuole","Variation","Ventilate","Vertebrate","Viable","Virus","Vital","Vitamin","Viviparous","Volume","Voluntary","Waste","Weather"
    };
    String[] sport = {"Aerobics","Archer","Archery","Arena","Arrow","Athlete","Athletics","Axel","Badminton","Ball","Base","Baseball","Basketball","Bat","Baton","Batter","Batting","Biathlon","Bicycle","Bicycling","Bike","Biking","Billiards","Bobsleigh","Bocce","Boomerang","Boules","Bow","Bowler","Bowling","Boxer","Boxing","Bronze Medal","Bunt","Canoe","Canoeing","Catch","Catcher","Champion","Championship","Cleats","Club","Coach","Compete","Competing","Competition","C Cont.","Competitor","Crew","Cricket","Croquet","Cross Country","Cue","Curling","Cycle","Cycling","Cyclist","Dart","Dartboard","Deadlifting","Decathlon","Defense","Diamond","Discus","Dive","Diver","Diving","Dodgeball","Doubleheader","Dugout","Epee","Equestrian","Equipment","Exercise","Fencing","Field","Fielder","Field Hockey","Fielding","Figure Skating","Fitness","Football","Forward","Free Throw","Frisbee","Game","Gear","Geocaching","Go","Goal","Goalie","Gold Medal","G Cont.","Golf","Golfer","Golfing","Guard","Gym","Gymnast","Gymnastics","Gymnasium","Halftime","Hammer Throw","Handball","Hang Gliding","Hardball","Helmet","Heptathlon","High Jump","Hitter","Hockey","Hole-In-One","Home","Home Plate","Home Run","Home Team","Hoop","Horseshoes","Huddle","Hurdle","Ice Hockey","Ice Rink","Ice Skates","Ice Skating","Infield","Infielder","Inline Skates","Inning","Jai-Alai","Javelin","Jog","Jogger","Judo","Jump","Jumper","Jumping","Jump Rope","Karate","Kayak","Kayaker","Kayaking","Kickball","Kneepads","King Fu","Kite","Lacrosse","Lawn Bowling","League","Long Jump","Lose","Loser","Luge","Lutz","Major League","Mallet","Martial Arts","Mat","Medal","Minor League","Mitt","Mouthguard","Move","Movement","Mvp","Net","No-Hitter","Nordic Skiing","Offense","Ollie","Olympics","Orienteering","Out","Outfield","Outfielder","Paddle","Paddleball","Paddling","Paintball","Parasailing","Parkour","P Cont.","Pentathlon","Pickleball","Ping Pong","Pitch","Pitcher","Play","Player","Playing","Playoffs","Pogo Stick","Pole","Pole Vault","Polo","Pool","Puck","Quarter","Quarterback","Quiver","Race","Racer","Racewalking","Racing","Racket","Racquetball","Rafting","Referee","Relay","Ride","Riding","Rink","Rock Climbing","Roller Skates","Roller Skating","Row","Rower","Rowing","Rugby","Run","Runner","Running","Sailing","Score","Scoreboard","Scuba","Scull","S Cont.","Sculling","Shortstop","Shot Put","Silver Medal","Skate","Skating Rink","Skeleton","Ski","Skier","Skiing","Slalom","Sled","Sledder","Sledding","Snorkling","Snowboard","Snowboarder","Snowboarding","Snowshoeing","Soccer","Softball","Somersault","Speed Skating","Sport","Sportsmanship","Squash","Stadium","Stick","Strike","Stroke","Sumo Wrestling","Surfer","Surfing","Swim","Swimmer","Swimming","Synchronized Swimming","Table Tennis","Taekwondo","Tag","Target","Team","Teammate","Tee","Telemark Skiing","Tennis","Tetherball","Throw","T Cont.","Throwing","Tie","Toboggan","Track And Field","Trampoline","Triathlon","Triathlete","Triple Jump","Triple Play","Tug Of War","Ultramarathon","Ultramarathoner","Umpire","Unicycle","Unicyclist","Uniform","Vault","Vaulter","Vaulting","Visiting Team","Volley","Volley Ball","Wakeboarding","Walk","Walker","Walking","Water Polo","Waterski","Waterskier","Waterskiing","Weightlifter","Weightlifting","Weights","Wetsuit","White Water Rafting","Wicket","Win","Windsurfer","Windsurfing","Winner","Winning","World Cup","World Series","Wrestler","Wrestling"
    };
    String[] geography = {"Africa","altitude","analemma","Antarctica","Antarctic Circle","antipodes","Arctic","Arctic Circle","area","Asia","atlas","Australia","azimuth","bathymetric map","border","capital","capital city","cartographer","cartography","chart","city","compass rose","continent","contour line","country","degree of latitude","degree of longitude","Earth","east","Eastern Hemisphere","elevation","equator","Europe","geographic coordinates","geography","global","globe","GPS","great circle","hemisphere","IDL","International Date Line","island","key","kilometers","land","landform","latitude","legend","longitude","magnetic pole","map","map-maker","map-making","map projection","Mercator Projection","meridian","miles","mountain","mountain range","nation","nautical chart","north","northeast","Northern Hemisphere","northwest","North America","North Magnetic Pole","North Pole","ocean","parallel","peak","pole","political map","prime meridian","projection","ratio","region","relief map","river","road atlas","rose","scale","scale bar","sea","sea level","south","southeast","southwest","South America","Southern Hemisphere","South Magnetic Pole","South Pole","street map","territory","time zone","title","topographic map","topography","tributary","Tropic of Cancer","Tropic of Capricorn","tropics","weather map","west","Western Hemisphere","world"
    };
    String[] pirates = {"Abandon","Adventure","Ahoy","Anchor","Armada","Arms","Asea","Ashore","Assault","Attack","Aye-Aye","Bad","Bandanna","Bandit","Bandolier","Barbaric","Barrel","Battle","Beach","Behead","Boatswain","Bos'N","Bounty","Brawl","Brutal","Buccaneer","Cannon","Capsize","Captain","Capture","Cargo","Cave","Challenge","Chest","Coast","Coastline","Coins","Compass","Confiscate","Conquest","Contraband","Corpse","Corsair","Course","Crew","Criminal","Crook","Crow'S Nest","Cruel","Curse","Cutlass","Cutthroat","Dagger","Danger","Daring","Dead Reckoning","Deck","Deck Hands","Desert Island","Dishonest","Doubloon","Earring","Escape","Evil","Explore","Eye Patch","Fear","Fearsome","Ferocious","Fight","First Mate","Flag","Fleet","Flotsam And Jetsam","Fortune","Galleon","Gangplank","Gear","Gibbet","Gold","Greed","Gun","Gunner","Gunpowder","Haul","Heist","High Seas","Hijack","Hook","Hold","Horizon","Hostile","Hull","Hurricane","Illegal","Ill-Gotten","Infamous","Island","Jetsam","Jewels","Jolly Roger","Keel","Keelhaul","Kidnap","Kill","Knife","Land","Land-Ho","Landlubber","Lash","Lawless","Legend","Limey","Long John Silver","Lookout","Loot","Lore","Lucre","Maggot","Malaria","Map","Marauder","Matiner","Maroon","Mast","Mates","Mayhem","Menace","Merchant","Musket","Mutiny","Nautical","Navigate","New World","Notorious","Ocean","Old Salt","Old World","Outcasts","Overboard","Parley","Parrot","Pegleg","Pieces Of Eight","Pillage","Pirate","Pistol","Plank","Plunder","Predatory","Privateer","Prowl","Quartermaster","Quarters","Quest","Raid","Ransack","Rat","Rations","Realm","Reckoning","Revenge","Revolt","Riches","Rigging","Roam","Rob","Robber","Rope","Rudder","Ruffian","Rum","Ruthless","Sabotage","Sail","Sailing","Sailor","Scalawag","Scar","Scurvy","S Cont.","Seas","Seaweed","Sextant","Ship","Shipmate","Shiver-Me-Timbers","Shore","Silver","Skiff","Skull And Bones","Spoils","Steal","Swab The Deck","Swagger","Swashbuckling","Sword","Thief","Thievery","Thug","Tides","Torture","Trade","Treachery","Treasure","Treasure Island","Truce","Unlawful","Unscrupulous","Vandalize","Vanquish","Vessel","Vicious","Vile","Villain","Violence","Violent","Walk The Plank","Weapons","X Marks The Spot","Yellow Fever","Yo-Ho-Ho"
    };
    String[] camping = {"Ability","Access","Accident","Acclimatize","Accompany","Adventure","Aesthetics","Afternoon","Aid","Alert","Alpine","Alps","Altitude","Amateur","Ambivalent","Apex", "Appellation","Appropriate","Arduous","Ascent","Aspire","Attention","Attire","Audacious","Augur","Bandage","Bear box","Behemoth","Beverage","Bivouac","Boots","Buddy", "Calamity","Camping","Care","Castigate","Catharsis","Caution","Challenge","Choices","Cliff","Climate","Climb","Cloud line","Cloudless","Cohorts","Compass","Compatible", "Compulsive","Conditions","Countenance","Courage","Daring","Dark","Daylight","Debilitating","Define","Dehydrated","Demeanor","Descend","Descent","Destination","Determination", "Distance","Diverse","Dramatic","Drinking","Ebullient","Effervescent", "Elements","Emergency","Entreat","Epitomize","Equivocal","Escape","Essentials","Evaluate","Excruciating","Exhaustion","Expedition","Experience","Expert","Expertise","Fall", "Family","Family-friendly","Fear","Feat","Find","First aid","Fishing","Fitness","Flashlight","Food","Foray","Formidable","Fortuitous","Freedom","Gear","Glacial","Ground","Group", "Grueling","Guide","Hairpin turn","Hamper","Hazards","Heavy","Heed","Height","Hiking","Hobby","Hubris","Hydrate","Impede","Imposing","Infirmity","Inherent","Injury","Innocuous", "Insects","Instinct","Insulation","Intensity","Intrinsic","Invincible","Irrefutable","Jacket","Jagged","Jeopardize","Jostle","Journey","Joy","Keen","Kids","Knapsack","Laceration", "Languish","Leader","Leisure","Lethargy","Load","Looking","Maneuver","Map","Medicine","Miserable","Moraine","Mosquitoes","Mountain","Myriad","National","Nature","Navigate", "Neophyte","Novice","Observe","Obsession","Opportunity","Option","Orientation","Outdoors","Outside","Overlooking","Packs","Passion","Peak","Peripheral","Permit", "Pinnacle","Place","Plan","Polarize","Precarious","Precaution","Precipitous","Preparation","Professional","Promontory","Protection","Provisions","Quest","Questions","Queue","Quiet", "Quintessential","Quit","Ranger","Reach","Recreation","Relinquish","Relish","Remote","Repellent","Rescue","Research","Resist","Resolute","Resonate","Respect","Rest","Reward","Risk", "Rough","Route","Rubble","Safety","Scale","Scenic","Segment","Shelter","Sign in","Signal device","Solo","Spectacular","Sporadic","Steep","Stipulation","Stones","Strait","Stream", "Strength","Stuff","Stumble","Succumb","Summit","Sun","Sun screen","Sunglasses","Survey","Team","Terrain","Throng","Time","Top-tier","Trail","Trail mix","Tranquility","Tread", "Treat","Treats","Trek","Trekker","Trip","Undermine","Unexpected","Up","Upwards","UV rays","Vacation","Vast","Venerate","Veteran","Victim", "View","Violate","Walk","Wander","Warning","Water","Weary","Weather","Whistle","Whistling winds","Wicking","Wild","Wilderness","Wisdom","Worry","X-ray","Yearn","Young","Youth","Zealous","Zest", "Zigzag","Backpack","Cabin","Camp","Camper","Bonfire","Campfire","Campground","Canoe","Canteen","Cap","Caravan","Climb","Day pack","Dehydrated food","Dugout","Equipment","Evergreen", "Forest","Gorp","Hammock","Hat","Hike","Hiking Boots","Hunting","Hut","Insect Repellent","Kayak","Lake","Lantern","Moon","National Park","Natural","Oar","Outdoors","Outside","Paddle","Park","Path","Pup Tent","Rope","Scenery","Sleeping bag","Stars","State park","Sun","Sunscreen","Tarp","Tent","Trail Mix","Trailer","Trees", "Trip","Vest","Walking","Water Bottle","Waterfall","Wildlife","Woods"
    };
    String[] nationalParks = {"Smoky Mountains National Park ","Grand Canyon National Park ","Rocky Mountain National Park ","Yosemite National Park ","Yellowstone National Park ","Zion National Park ","Olympic National Park ","Grand Teton National Park ","Acadia National Park ","Glacier National Park","Camino de Santiago","Great Ocean Walk","Bruce Trail","John Muir Trail","Shikoku Pilgrimage","Jeju Olle Trail","Cotswolds Way","The Pacific Crest Trail","The Appalachian Trail","Inca Trail"
    };
    String[] countries = {"Afeghanistan","Albania","Algeria","Andorra","Angola","Antiguaand Barbuda","Argentina","Armenia","Australia","Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bhutan","Bolivia","Bosniaand Herzegovina","Botswana","Brazil","Brunei","Bulgaria","BurkinaFaso","Burma","Burundi","Cambodia","Cameroon","Canada","CapeVerde","CentralAfrican Republic","Chad","Chile","China","Cambodia","Comoros","Congo,Dem. Rep. of the","Congo,Rep of the","CostaRica","Côted'Ivoire","Croatia","Cuba","Cyprus","CzechRepublic","Denmark","Djibouti","Dominica","DominicanRepublic","EastTimor","Ecuador","Egypt","ElSalvador","EquatorialGuinea","Eritrea","Estonia","Ethiopia","Fiji","Finland","France","Gabon","TheGambia","Georgia","Germany","Ghana","Greece","Grenada","Guatemala","Guinea","Guinea-Bissau","Guyana","Haiti","Honduras","Hungary","Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy","Jamaica","Japan","Jordan","Kazakhstan","Kenya","Kiribati","Korea,North","Korea,South","Kuwait","Kyrgyzstan","Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg","Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","MarshallIslands","Mauritania","Mauritius","Mexico","Micronesia","Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique","Namibia","Nauru","Nepal","Netherlands","NewZealand","Nicaragua","Niger","Nigeria","Norway","Oman","Pakistan","Palau","Panama","PapuaNew Guinea","Paraguay","Peru","Philippines","Poland","Portugal","Qatar","Romania","Russia","Rwanda","SaintKitts and Nevis","SaintLucia","SaintVincent and the Grenadines","Samoa","SanMarino","SãoTomé and Príncipe","SaudiArabia","Senegal","Serbia","Seychelles","SierraLeone","Singapore","Slovakia","Slovenia","SolomonIslands","Somalia","SouthAfrica","Spain","SriLanka","Sudan","Suriname","Swaziland","Sweden","Switzerland","Syria","Tajikistan","Tanzania","Thailand","Togo","Tonga","Trinidadand Tobago","Tunisia","Turkey","Turkmenistan","Tuvalu","Uganda","Ukraine","UnitedArab Emirates","UnitedKingdom","UnitedStates of America","Uruguay","Uzbekistan","Vanuatu","VaticanCity","Venezuela","Vietnam","Yemen","Zambia","Zimbabwe"
    };
    String[] dessert =  {"Almond Cookie","Ambrosia","Angelfood Cake","Apple Brown Betty","Apple Crisp","Apple Pie","Baked Alaska","Baked Apple","Baklava","Banana Split","Belgian Waffle","Biscotti","Black Forest Cake","Blueberry Muffin","Bombe","Boston Cream Pie","Bread Pudding","Brownie","Buttercream Frosting","Butterscotch","Cake","Cannoli","Caramel Apple","Carrot Cake","Cheesecake","Cherry Pie","Chocolate Bar","Chocolate Cake","Chocolate Chip Cookie","Chocolate Mousse","Churro","Cinnamon Roll","Cobbler","Coconut Cake","Coconut Cream Pie","Coffee Cake","Cookie","Crepe Suzette","Cupcake","Custard","Danish Pastry","Dessert","Devil'S Food Cake","Doughnut","Dumplings","Eclair","Flan","Fortune Cookie","French Toast","Fritter","Frosting","Frozen Yogurt","Fruit Cake","Fruit Cocktail","Fruit Salad","Fudge","Gelatin","Gelato","Gingersnaps","Gingerbread","Honey","Hot-Fudge Sundae","Ice Cream","Ice Cream Cake","Icing","Jam","Jelly","Jellyroll","Key Lime Pie","Ladyfingers","Lemon Bars","Lemon Meringue Pie","Macaroon","Marshmallow","Meringue","Milkshake","Molasses","Mousse","Muffin","Neapolitan Ice Cream","Nougat","Nut Brittle","Oatmeal Cookie","Pancakes","Panna Cotta","Parfait","Pastry","Peanut Brittle","Peanutbutter Cookie","Pecan Pie","Pie","Poached Pears","Popcicle","Popover","Pound Cake","Praline","Pudding","Pumpkin Pie","Quick Bread","Red Velvet Cake","Rhubarb Pie","Raisin Bread","Rice Pudding","Scone","Sherbet","Shortbread","S'Mores","Snickerdoodle","Soda","Soda Bread","Sorbet","Souffle","Sponge Cake","Spumoni","Strawberry Shortcake","Strudel","Sugar","Sugar Cookie","Sundae","Sweet Potato Pie","Sweet Roll","Sweets","Tapioca Pudding","Tart","Toasted Marshmallow","Toffee","Torte","Trifle","Truffle","Turnover","Upside-Down Cake","Vanilla Cream Pie","Vanilla Pudding","Waffle","Watermelon Ice","Yellow Cake","Zabiglone"
    };
    String[] car = {"Auto","Automobile","Buggy","Car","Cloth-Top","Compact","Convertible","Coupe","Cruiser","Dragster","Electric Car","Four-Door","Four-Wheel Drive","Gas Powered","Gas-Electric","Hard Top","Hatchback","Hearse","Hot Rod","Hum-Vee","Hybrid","Jeep","Limo","Limousine","Low-Rider","Luxury Car","Minivan","Off-Road Vehicle","Patrol Car","Race Car","Ragtop","Roadster","Rotary Engine","Runabout","Rv","Sedan","Soft-Top","Solar Powered","Sports Car","Sports Utility Vehicle","Station Wagon","Stock Car","Stretch Limo","Subcompact","Suv","Taxi","Taxi Cab","Two-Door","Van"
    };
    String[] instrument= {"Accordion","Acoustic Guitar","Aeolian Harp","Alphorn","Alto Saxophone","Anvil","Baby Grand Piano","Bagpipe","Balalaika","BandoneóN","Bandura","Banjo","Baritone Horn","Bass","Bass Clarinet","Bass Drum","Bass Guitar","Bassoon","Bell","Bongo Drum","Bouzouki","Bow","Brass Instruments","Bugle","Calliope","Carillon","Castanets","Celesta","Cello","Celtic Harp","Chimes","Cimbalom","Clarinet","Classical Guitar","Clavichord","Clavier","Concertina","Conch","Conga Drum","Contrabass","Cornet","Cowbell","Cymbals","Didgeridoo","Double Bass","Drum","Drumsticks","Dulcimer","Electric Guitar","Electric Organ","English Horn","Euphonium","Fiddle","Fife","Flugelhorn","Flute","French Horn","Glockenspiel","Gong","Grand Piano","Guitar","Hammered Dulcimer","Harmonica","Harmonium","Harp","Harpsichord","Helicon","Horn","Hurdy Gurdy","Instrument","Jaw Harp","Jew'S Harp","Kazoo","Kettledrum","Keyboard","Lute","Lyre","Mallets","Mandolin","Maracas","Marimba","Mellophone","Melodeon","Moog Synthesizer","Musical Instruments","Musical Saw","Mute","Oboe","Ocarina","Organ","Pan Pipes","Penny Whistle","Percussion","Piano","Piccolo","Pipa","Pipe Organ","Player Piano","Pump Organ","Rainstick","Rattle","Recorder","Reed","Saw","Saxophone","Sitar","Slide Whistle","Snare Drum","Spinet","Spoons","Steel Drum","S Cont.","Sousaphone","Steel Drum","Steel Guitar","String Bass","String Instruments","Strings","Synthesizer","Tabla","Tambourine","Theramin","Thumb Piano","Timpani","Tin Whistle","Tom-Tom Drum","Triangle","Trombone","Trumpet","Tuba","Tubular Bells","Ukulele","Upright Piano","Valve","Vibraphone","Viola","Viola Da Gamba","Violin","Violincello","Vuvuzela","Wagner Tuba","Washboard","Whistle","Wind Chime","Wind Instruments","Woodwind Instruments","Xylophone","Zither"
    };
    String[] physics = {"Absolute Zero","Absorption","Acceleration","Acceleration Due To","Gravity","Adhesion","Ammeter","Ampere","Amplitude","Angle Of Incidence","Angle Of Reflection","Archimedes' Principle","Battery","Bernoulli'S Principle","Buoyant Force","Capacitance","Capacitor","Capillary Action","Centripetal Acceleration","Centripetal Force","Closed System","Coefficient Of Friction","Collision","Components","Concave","Conduction","Conductors","Constant","Constructive","Interference","Convection","Convex","Cosine","Coulomb'S Law","Crests","Critical Angle","Current","Decibel","Derived Units","Destructive","Interference","Diffraction","Diffraction Grating","Displacement","Distance","Domain","Doppler Effect","Electric Circuit","Electric Current","Electric Field","Electromagnet","Electromagnetic Wave","Electron Cloud","Electroscope","Electrostatics","Elementary Chare","Emission","Energy","Energy Levels","Entropy","Equilibrium","Excited State","External Force","Final Velocity","Focal Length","Focal Point","Force","Frequency","Friction","Fundamental Units","Gamma Rays","Ground State","Grounding","Heat","Horizontal","Image","Index Of Refraction","Induction","Initial Velocity","Instantaneous","Insulators","Interference","Internal Force Pulse","Isotopes","Joule","Kelvin","Kinetic Energy","Kinetic Theory","Laser","Law Of Conservation Of","Energy","Law Of Conservation Of","Momentum","Law Of Reflection","Lens","Lenz'S Law","Light","Longitudinal Wave","Loudness","Magnetic Field","Magnetic Flux","Magnification","Mass","Mass Spectrometer","Mechanical Wave","Metric System","Momentum","Neutral","Newton'S First Law","Newton'S Second Law","Newton'S Third Law","Normal","Opaque","Optics","Parallax","Parallel Circuit","Pascal","Pascal'S Principle","Pendulum","Period","Photoelectric Effect","Photons","Physics","Pitch","Polarized","Position","Potential Difference","Potential Energy","Potentiometer","Power","Primary Coil","Principle Of","Superposition","Projectiles","Radiation","Range","Ray","Reflection","Refraction","Resistance","Resistors","Resonance","Resultant","Right-Hand Rule","Satellite","Scalar","Scientific Notation","Secondary Coil","Self-Inductance","Series Circuit","Si","Simple Harmonic","Motion","Sine","Snell'S Law","Specific Heat","Spectrum","Speed","Static Friction","System","Tangent","Temperature","Terminal Velocity","Thermodynamics","Torque","Total Internal Reflection","Trajectory","Transformer","Transparent","Transverse Wave","Trigonometry","Troughs","Vector","Vector Resolution","Velocity","Vertical","Virtual Image","Volt","Voltmeter","Watt","Wavelength","Weight","Work","Work Energy Theorem","X-Ray"
    };

    // wordlist[0] == flag for Computer Science
    // wordlist[1] == flag for astronomy
    // wordlist[2] == flag for biology
    // wordlist[3] == flag for sport
    //...
    // wordlist[n] == flag for ...
    boolean[] wordlist = {false, false, false, false, false, false, false, false, false, false, false, false, false};

    //creates a new activity and passes the worlist to it
    public void startGame(ArrayList<String> wordlist){
        Intent intent = new Intent(this, DisplayWords.class);
        intent.putStringArrayListExtra("wordlist", wordlist);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deck);

        //setting flags(boolean wordlist) to determine is the Check Boxes were selected or not
        CheckBox computerBox = (CheckBox) findViewById(R.id.computerScience);

        computerBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                   @Override
                                                   public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                       if (isChecked) {
                                                           wordlist[0] = true;
                                                       } else {
                                                           wordlist[0] = false;
                                                       }
                                                   }
                                               }
        );

        CheckBox astronomyBox = (CheckBox) findViewById(R.id.astronomy);

        astronomyBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                        if (isChecked) {
                                                            wordlist[1] = true;
                                                        } else {
                                                            wordlist[1] = false;
                                                        }
                                                    }
                                                }
        );

        CheckBox biologyBox = (CheckBox) findViewById(R.id.biology);

        biologyBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                  @Override
                                                  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                      if (isChecked) {
                                                          wordlist[2] = true;
                                                      } else {
                                                          wordlist[2] = false;
                                                      }
                                                  }
                                              }
        );


        CheckBox sportBox = (CheckBox) findViewById(R.id.sports);
        sportBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                @Override
                                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                    if (isChecked) {
                                                        wordlist[3] = true;
                                                    } else {
                                                        wordlist[3] = false;
                                                    }
                                                }
                                            }
        );

        CheckBox geographyBox = (CheckBox)findViewById(R.id.geography);
        geographyBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                        if (isChecked) {
                                                            wordlist[4] = true;
                                                        } else {
                                                            wordlist[4] = false;
                                                        }
                                                    }
                                                }
        );

        CheckBox piratesBox = (CheckBox)findViewById(R.id.pirates);
        piratesBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                        if (isChecked) {
                                                            wordlist[5] = true;
                                                        } else {
                                                            wordlist[5] = false;
                                                        }
                                                    }
                                                }
        );

        CheckBox campingBox = (CheckBox)findViewById(R.id.camping);
        campingBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                        if (isChecked) {
                                                            wordlist[6] = true;
                                                        } else {
                                                            wordlist[6] = false;
                                                        }
                                                    }
                                                }
        );

        CheckBox countriesBox = (CheckBox)findViewById(R.id.countries);
        countriesBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                  @Override
                                                  public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                      if (isChecked) {
                                                          wordlist[7] = true;
                                                      } else {
                                                          wordlist[7] = false;
                                                      }
                                                  }
                                              }
        );

        CheckBox dessertBox = (CheckBox)findViewById(R.id.dessert);
        dessertBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                        if (isChecked) {
                                                            wordlist[8] = true;
                                                        } else {
                                                            wordlist[8] = false;
                                                        }
                                                    }
                                                }
        );

        CheckBox carBox = (CheckBox)findViewById(R.id.car);
        carBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                    @Override
                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                        if (isChecked) {
                                                            wordlist[9] = true;
                                                        } else {
                                                            wordlist[9] = false;
                                                        }
                                                    }
                                                }
        );

        CheckBox instrumentBox = (CheckBox)findViewById(R.id.instrument);
        instrumentBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                              @Override
                                              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                  if (isChecked) {
                                                      wordlist[10] = true;
                                                  } else {
                                                      wordlist[10] = false;
                                                  }
                                              }
                                          }
        );

        CheckBox physicsBox = (CheckBox)findViewById(R.id.physics);
        physicsBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                                                     @Override
                                                     public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                         if (isChecked) {
                                                             wordlist[11] = true;
                                                         } else {
                                                             wordlist[11] = false;
                                                         }
                                                     }
                                                 }
        );

        //setting a listener for the play button
        Button play = (Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                    ArrayList<String> gameWordlist = new ArrayList<String>();

                    int i;
                    //if the wordlist was selected add that wordlist to the ArrayList gameWordlist
                    if(wordlist[0]){
                       for( i=0; i < computerScience.length; i++) {
                           gameWordlist.add(computerScience[i]);
                       }
                    }
                    if(wordlist[1]){
                        for( i=0; i < astronomy.length; i++) {
                            gameWordlist.add(astronomy[i]);
                        }

                    }
                    if(wordlist[2]){
                        for( i=0; i < biology.length; i++) {
                            gameWordlist.add(biology[i]);
                        }

                    }
                    if(wordlist[3]){
                        for( i=0; i < sport.length; i++) {
                            gameWordlist.add(sport[i]);
                        }
                    }
                    if(wordlist[4]){
                            for( i=0; i < geography.length; i++) {
                                gameWordlist.add(geography[i]);
                            }

                    }
                    if(wordlist[5]){
                        for( i=0; i < pirates.length; i++) {
                            gameWordlist.add(pirates[i]);
                        }

                    }
                    if(wordlist[6]){
                        for( i=0; i < camping.length; i++) {
                            gameWordlist.add(camping[i]);
                        }
                        for( i=0; i < nationalParks.length; i++) {
                            gameWordlist.add(nationalParks[i]);
                        }

                    }
                    if(wordlist[7]){
                        for( i=0; i < countries.length; i++) {
                            gameWordlist.add(countries[i]);
                        }

                    }

                    if(wordlist[8]){
                        for(i=0; i< dessert.length; i++){
                            gameWordlist.add(dessert[i]);
                        }
                    }
                    if(wordlist[9]){
                        for(i=0; i< car.length; i++){
                            gameWordlist.add(car[i]);
                        }
                    }
                    if(wordlist[10]){
                        for(i=0; i< instrument.length; i++){
                            gameWordlist.add(instrument[i]);
                        }
                    }
                    if(wordlist[11]){
                        for(i=0; i< physics.length; i++){
                            gameWordlist.add(physics[i]);
                        }
                    }


                //starts the game and passes the wordlist as an EXTRA to the next activity
                if(gameWordlist.isEmpty() == false) {
                    startGame(gameWordlist);
                }
            }
        });
    }

}
