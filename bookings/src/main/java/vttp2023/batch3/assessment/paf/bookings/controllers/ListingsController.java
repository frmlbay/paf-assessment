package vttp2023.batch3.assessment.paf.bookings.controllers;

@Controller
@RequestMapping
public class ListingsController {

	// db.listings.find({ 
    // 'address.country': 'a string', { $exists: true },
    // {$and:[{guests_included:{$gt:1}},{guests_included:{$lt:10}}]},
    // {$and:[{price:{$gt:1}},{price:{$lt:10000}}]}
	// });

	//TODO: Task 2
	@Autowired
	private ListingService listSvc;

	@GetMapping(path='/search')
	public ModelAndView search(@RequestParam String acmd){}

	List<Accomodation> acmd_s = listSvc.searchAccomodation(acmd);

	ModelAndView mvc = new ModelAndView();
	mvc.setViewName("searchresult");
	mvc.setStatus(HttpStatusCode.valueOf(200));

	return mvc;
}

	
	//TODO: Task 3


	//TODO: Task 4
	

	//TODO: Task 5


}
